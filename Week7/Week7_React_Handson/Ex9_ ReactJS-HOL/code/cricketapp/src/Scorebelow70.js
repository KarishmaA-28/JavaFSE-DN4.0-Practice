import React from "react";

// Arrow function used directly in the filter
const Scorebelow70 = ({ players }) => {
  const filtered = players.filter(p => p.score < 70);
  return (
    <ul>
      {filtered.map((player, idx) => (
        <li key={idx}>{player.name} {player.score}</li>
      ))}
    </ul>
  );
};

export default Scorebelow70;
