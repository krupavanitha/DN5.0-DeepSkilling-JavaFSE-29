import "./App.css";

function App() {
  const students = [
    { id: 1, name: "Krupa", course: "CSE" },
    { id: 2, name: "Anjali", course: "ECE" },
    { id: 3, name: "Rahul", course: "IT" },
    { id: 4, name: "Sneha", course: "EEE" }
  ];

  return (
    <div className="App">
      <h1>Student List</h1>

      {students.map((student) => (
        <div key={student.id} className="card">
          <h2>{student.name}</h2>
          <p>{student.course}</p>
        </div>
      ))}
    </div>
  );
}

export default App;