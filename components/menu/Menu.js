import Link from 'next/link';
import styles from './Menu.module.css';

console.log(styles);

const Menu = () => {    
    return (
        <div id={styles.menu}>
            <Link href='/login'>Login</Link>
            <Link href='/register'>Register</Link>
            <Link href='/stable'>Stable</Link>
            <Link href='/dungeon'>Dungeon</Link>
        </div>
    )
}

export default Menu;