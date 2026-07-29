import React from "react";
import "../stylesheets/mystyle.css";

function CalculateScore() {
  const Name = "Krupa";
  const School = "Vignan Institute of Engineering for Women";
  const Total = 500;
  const Goal = 420;

  return (
    <div className="container">
      <h1>Student Details</h1>

      <p><b>Name:</b> {Name}</p>
      <p><b>School:</b> {School}</p>
      <p><b>Total Marks:</b> {Total}</p>
      <p><b>Goal:</b> {Goal}</p>

      <h2>
        {Goal >= 250 ? "Congratulations! You Passed." : "Better Luck Next Time."}
      </h2>
    </div>
  );
}

export default CalculateScore;