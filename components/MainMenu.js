import styles from './MainMenu.module.css';

const MainMenu = (props) => {
	const screenSize = 640;
	let index = 0;
	
	return (
		<div id={styles.content}>
            <div className={styles.bar}>
                <img src="menu/cracked_bar.png" />
                <img src="menu/cracked_bar.png" />
                <img src="menu/cracked_bar.png" />
                <img src="menu/cracked_bar.png" />
                <img src="menu/cracked_bar.png" />
                <img src="menu/cracked_bar.png" />
                <img src="menu/cracked_bar.png" />
            </div>
            <div className={styles.flex}>
                <div className={styles.col}>
                    <img className={`${styles.rot180} ${styles.crescent}`} src="menu/interface_crescent.png" />
                    <img className={`${styles.rot270} ${styles.crescent}`} src="menu/interface_crescent.png" />
                </div>
                <div className={styles.centerCol}>
                    Dungeon Assault
                </div>
                <div className={styles.col}>
                    <img className={`${styles.rot180} ${styles.crescent}`} src="menu/interface_crescent.png" />
                    <img className={`${styles.rot270} ${styles.crescent}`} src="menu/interface_crescent.png" />
                </div>
            </div>
            <div className={styles.bar40}>
                <img src="menu/cracked_bar.png" />
                <img src="menu/cracked_bar.png" />
                <img src="menu/cracked_bar.png" />
                <img src="menu/cracked_bar.png" />
                <img src="menu/cracked_bar.png" />
                <img src="menu/cracked_bar.png" />
                <img src="menu/cracked_bar.png" />
            </div>
            <div id={styles.centerContent}>
                <img src="menu/cracked_bar_90.png" />
                <img src="menu/left.jpeg" />
                <img src="menu/back.jpeg" />

                <div id={styles.buttonPanel}>
                    <div><span className={styles.label}>Hello</span><img className={styles.button} src="menu/menu_button.png" /></div>
                    <div><span className={styles.label}>Hello</span><img className={styles.button} src="menu/menu_button.png" /></div>
                    <div><img className={styles.button} src="menu/menu_button.png" /></div>
                    <div><img className={styles.button} src="menu/menu_button.png" /></div>
                    <div><img className={styles.button} src="menu/menu_button.png" /></div>
                    <div><img className={styles.button} src="menu/menu_button.png" /></div>
                    <div><img className={styles.button} src="menu/menu_button.png" /></div>
                    <div><img className={styles.button} src="menu/menu_button.png" /></div>
                </div>

                <img id={styles.menuBlock} src="menu/menu_block.png" />

                <img src="menu/right.jpeg" />
                <img src="menu/cracked_bar_90.png" />
                <img id={styles.bottomBar} src="menu/cracked_bar_bottom.png" />
            </div>
		</div>
	)
}

export default MainMenu;