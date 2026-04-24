import { useEffect, useState } from "react";
import axios from "axios";

export default function Dashboard() {
  const [data, setData] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/api/patients")
      .then(res => setData(res.data));
  }, []);

  return (
    <div>
      <h1>Chronic Care Dashboard</h1>
      {data.map(p => (
        <div key={p.id}>
          <h3>{p.patientName}</h3>
          <p>BP: {p.bloodPressure}</p>
          <p>Sugar: {p.sugarLevel}</p>
        </div>
      ))}
    </div>
  );
}
