import React from "react";

function OddPlayers({ indianTeam }) {
  return (
    <div>
      <h2>Odd Players</h2>
      <ul>
        {indianTeam
          .filter((_, idx) => idx % 2 === 0)
          .map((player, idx) => (
            <li key={idx}>{player}</li>
          ))}
      </ul>
    </div>
  );
}

function EvenPlayers({ indianTeam }) {
  return (
    <div>
      <h2>Even Players</h2>
      <ul>
        {indianTeam
          .filter((_, idx) => idx % 2 !== 0)
          .map((player, idx) => (
            <li key={idx}>{player}</li>
          ))}
      </ul>
    </div>
  );
}

function ListofIndianPlayers({ IndianPlayers }) {
  return (
    <ul>
      {IndianPlayers.map((p, idx) => (
        <li key={idx}>{p}</li>
      ))}
    </ul>
  );
}

function IndianPlayersComp() {
  const T20players = [
    "Mr. First Player", "Mr. Second Player", "Mr. Third Player",
  ];
  const RanjiTrophyPlayers = [
    "Mr. Fourth Player", "Mr. Fifth Player", "Mr. Sixth Player",
  ];
  const merged = [...T20players, ...RanjiTrophyPlayers];

  const indianTeam = [
    "Sachin1", "Dhoni2", "Virat3", "Rohit4", "Yuvaraj5", "Raina6"
  ];

  return (
    <div>
      <OddPlayers indianTeam={indianTeam} />
      <EvenPlayers indianTeam={indianTeam} />
      <h2>List of Indian Players Merged:</h2>
      <ListofIndianPlayers IndianPlayers={merged} />
    </div>
  );
}
export default IndianPlayersComp;
