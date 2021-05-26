import PurchasableTrap from './PurchasableTrap';

const PurchaseTrapPanel = (props) => {
    const onSelectItem = (trap) => {
        props.onSelectItem(trap);
    }

    return (
        <div>
            {props.traps.map(el => (
                <PurchasableTrap trap={el} onSelectItem={onSelectItem} />
            ))} 
        </div>
    )
}

export default PurchaseTrapPanel;