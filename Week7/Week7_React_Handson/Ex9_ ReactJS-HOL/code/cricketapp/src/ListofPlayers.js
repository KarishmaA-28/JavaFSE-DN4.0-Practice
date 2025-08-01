import React from "react";

function ListofPlayers({ players }) {
  // Using the ES6 map method to display player name and score
  return (
    <ul>
      {players.map((player, idx) => (
        <li key={idx}>
          {player.name} {player.score}
        </li>
      ))}
    </ul>
  );
}

export default ListofPlayers;
