import { useState, useEffect } from 'react';
import Square from './Square';

const Row = (props) => {
    return (
        <div style={{display: "flex"}}>
            <Square state={props.path[0]} placedTrap={props.placedTraps[0]} onTrapChange={props.onTrapChange} id={props.id} />
            <Square state={props.path[1]} placedTrap={props.placedTraps[1]} onTrapChange={props.onTrapChange} id={props.id+1}/>
            <Square state={props.path[2]} placedTrap={props.placedTraps[2]} onTrapChange={props.onTrapChange} id={props.id+2}/>
            <Square state={props.path[3]} placedTrap={props.placedTraps[3]} onTrapChange={props.onTrapChange} id={props.id+3}/>
            <Square state={props.path[4]} placedTrap={props.placedTraps[4]} onTrapChange={props.onTrapChange} id={props.id+4}/>
            <Square state={props.path[5]} placedTrap={props.placedTraps[5]} onTrapChange={props.onTrapChange} id={props.id+5}/>
            <Square state={props.path[6]} placedTrap={props.placedTraps[6]} onTrapChange={props.onTrapChange} id={props.id+6}/>
        </div>
    )
}

const DungeonLayout = (props) => {
    const [dungeonPath, setDungeonPath] = useState([]);
    const [isReady, setIsReady] = useState(false);

    const onTrapChange = (squareId) => {
        props.onTrapChange(squareId);
    }

    useEffect(() => {
        let [ seed1, seed2, seed3 ] = props.seeds;
        if(seed1 < 0) {
            seed1 = seed1 >>> 0;
        }
        if(seed2 < 0) {
            seed2 = seed2 >>> 0;
        }
        if(seed3 < 0) {
            seed3 = seed3 >>> 0;
        }

        let path = createEmptypath();

        //parse seed 1
		while(seed1 != 0) {
			let power = getLowestPowerOf2(seed1);
			let row = Math.floor(power.times / 6);
			let index = (power.times % 6);
			path[row][index].right = true;
			path[row][index+1].left = true;
			seed1 -= power.value;
		}
		
		//parse seed 2
		while(seed2 != 0) {
			let power = getLowestPowerOf2(seed2);
			if(power.value >= 1024) { //start doing downs
				let times = power.times - 10; //number of times it takes to get to 1024
				let row = Math.floor(times / 7);
				let index = (times % 7);
				path[row][index].down = true;
				path[row+1][index].up = true;
			}
			else { //sideways
				let row = 5 + Math.floor(power.times / 6);
				let index = 2 + (power.times % 6);
				if(index >= 6) {
					row++;
					index -= 6;
				}
				path[row][index].right = true;
				path[row][index+1].left = true;
			}
			seed2 -= power.value;
		}
		
		//parse seed3
		while(seed3 != 0) {
			//starts at 3, 1
			let power = getLowestPowerOf2(seed3);
			let row = 3 + Math.floor(power.times / 7);
			let index = 1 + (power.times % 7);
			if(index >= 7) {
				row++;
				index -= 7;
			}
			path[row][index].down = true;
			path[row+1][index].up = true;
			seed3 -= power.value;
		}
		setDungeonPath(path);
        setIsReady(true);
    }, []);


    const createEmptypath = () => {
		let a = [];
		for(var x=0;x<7;x++) {
			let row = [];
			for(var y=0;y<7;y++) {
				row.push({ up: false, left: false, right: false, down: false });
			}
			a.push(row);
		}
		return a;
	}

    const getLowestPowerOf2 = (num) => {
		let times = 0;
		let current = 2;
		while(current <= num) {
			current *= 2;
			times++;
		}
		if(current == 2) {
			return { times: 0, value: 1}
		}
		return { times: times, value: current/2 }
	}

    if(!isReady) {
        return null;
    }

    return (
        <div>
            <Row path={dungeonPath[0]} placedTraps={props.placedTraps[0]} onTrapChange={onTrapChange} id={1} />
            <Row path={dungeonPath[1]} placedTraps={props.placedTraps[1]} onTrapChange={onTrapChange} id={8} />
            <Row path={dungeonPath[2]} placedTraps={props.placedTraps[2]} onTrapChange={onTrapChange} id={15} />
            <Row path={dungeonPath[3]} placedTraps={props.placedTraps[3]} onTrapChange={onTrapChange} id={22} />
            <Row path={dungeonPath[4]} placedTraps={props.placedTraps[4]} onTrapChange={onTrapChange} id={29} />
            <Row path={dungeonPath[5]} placedTraps={props.placedTraps[5]} onTrapChange={onTrapChange} id={36} />
            <Row path={dungeonPath[6]} placedTraps={props.placedTraps[6]} onTrapChange={onTrapChange} id={43} />
        </div>
    )
}

export default DungeonLayout;