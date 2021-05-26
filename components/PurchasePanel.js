const PurchasePanel = (props) => {
    const onSelectItem = (item) => {
        props.onSelectItem(item);
    }

    return (
        <div>
            {props.items.map(el => (
                <props.type item={el} onSelectItem={onSelectItem} />
            ))} 
        </div>
    )
}

export default PurchasePanel;