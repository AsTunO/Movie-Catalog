import { ReactComponent as GithubIcon } from '../../assets/img/github.svg';
import "./styles.css";

function NavBar() {
    return (
        <header>
            <nav className="container">
                <div className="movie-nav-content">
                    <h1>Movie Catalog</h1>
                    <a className="link" href="https://github.com/AsTunO" target="_blank" rel="noreferrer">
                        <div className="movie-contact-container">
                            <GithubIcon />
                            <p className="movie-contact-link">/ AsTunO</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default NavBar;
