import Square from 'components/dungeon/Square';

const Row = (props) => {
    return (
        <div>
            <Square index={props.index} locked />
            <Square index={props.index+1} locked />
            <Square index={props.index+2} locked />
            <Square index={props.index+3} locked />
            <Square index={props.index+4} locked />
            <Square index={props.index+5} locked />
            <Square index={props.index+6} locked />
        </div>
    )
}

const Dungeon = (props) => {
    let squares = [];
    for(var i=0;i<49;i+=7) {
        squares.push(<Row index={i}/>);
    }
    return (
        <div>
            {squares}
        </div>
    )
}

export default Dungeon;