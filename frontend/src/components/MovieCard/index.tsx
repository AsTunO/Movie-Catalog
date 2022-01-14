import MovieScore from "../MovieScore";
import { Link } from "react-router-dom";
import { Movie } from "../../types/movie";
import "./styles.css";

type Props = {
    movie: Movie;
}

function MovieCard( {movie} : Props ) {
 
    return (
        <div>
            <img className="dsmovie-movie-card-image" src={movie.image} alt={movie.title} />
                <div className="dsmovie-card-bottom-container">
                    <h3>{movie.title}</h3>
                    <MovieScore count={movie.count} score={movie.score} />
                <Link to={`/form/${movie.id}`}>
                    <div className="btn btn-primary dsmovie-btn">
                        <span className="test">Avaliar</span>
                    </div>
                </Link>
                </div>
        </div>
    );
}

export default MovieCard;
