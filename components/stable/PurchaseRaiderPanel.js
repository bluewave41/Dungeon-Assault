import PurchasableRaider from './PurchasableRaider';

const PurchaseRaiderPanel = (props) => {
    const onSelectRaider = (raider) => {
        props.onSelectRaider(raider);
    }

    return (
        <div>
            {props.raiders.map(el => (
                <PurchasableRaider raider={el} onSelectRaider={onSelectRaider} />
            ))} 
        </div>
    )
}

export default PurchaseRaiderPanel;