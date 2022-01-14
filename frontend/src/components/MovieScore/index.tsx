import MovieStars from "../MovieStars";
import "./styles.css";

type Props = {
    score: number;
    count: number;
}

function MovieScore( {score, count} : Props ) { 
   
    return (
       <div className="movie-score-container">
            <p className="movie-score-value">{score > 0 ? score.toFixed(1) : '-'}</p>
                <MovieStars score={score} />
            <p className="movie-score-count">{count} assessments</p>
        </div>
    );
}

export default MovieScore;
