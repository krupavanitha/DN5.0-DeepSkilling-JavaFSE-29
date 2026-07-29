import "./App.css";

function App() {
  const isLoggedIn = true;

  return (
    <div className="App">
      <h1>Conditional Rendering in React</h1>

      {isLoggedIn ? (
        <h2>Welcome, Krupa!</h2>
      ) : (
        <h2>Please Login</h2>
      )}
    </div>
  );
}

export default App;