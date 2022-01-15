import {ReactComponent as IconArrow} from 'assets/img/arrow.svg';
import './styles.css';
function Pagination() {
    return (
        <div className="dsmovie-pagination-container">
        <div className="dsmovie-pagination-box">
            <button className="dsmovie-pagination-button" disabled={true} >
                <IconArrow />
            </button>
            <p>{`${1} de ${3}`}</p>
            <button className="dsmovie-pagination-button" disabled={false} >
                <IconArrow className="dsmovie-flip-horizontal" />
            </button>
        </div>
    </div>);
}

export default Pagination;