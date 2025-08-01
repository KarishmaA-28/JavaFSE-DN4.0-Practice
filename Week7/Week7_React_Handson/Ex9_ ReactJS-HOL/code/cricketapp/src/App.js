import React from "react";
import IndianPlayersComp from "./IndianPlayers";
// flag set to false
const flag = false;

export default function App() {
  if (flag === true) {
    // (Your true case for List of Players)
    return <div>/* ... */</div>;
  } else {
    return (
      <div>
        <IndianPlayersComp />
      </div>
    );
  }
}
