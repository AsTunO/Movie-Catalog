import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import Listing from '../src/pages/Listing';
import Form from '../src/pages/Form';
import Navbar from "../src/components/NavBar";

function App() {
  return (
    <BrowserRouter>
      <Navbar />
      <Routes>
        <Route path="/" element={<Listing />} />
        <Route path="/form">
          <Route path=":movieId" element={<Form />} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;