import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  const [counter, setCounter] = useState(1);
  const increment = () => setCounter(prev => prev + 1);
  const sayHello = () => {
    alert("Hello! This is a static Hello message.");
  };
  const handleIncrease = () => {
    increment();
    sayHello();
  };
  const decrement = () => setCounter(prev => prev - 1);
  const sayWelcome = (msg) => {
    alert(`Hello! ${msg}`);
  };
  const handleSyntheticEvent = (event) => {
    alert("I was clicked");
  };

  return (
    <div style={{ margin: 30 }}>
      {/* Counter Buttons */}
      <h2>{counter}</h2>
      <button onClick={handleIncrease}>Increment</button>
      <br /><br />
      <button onClick={decrement}>Decrement</button>
      <br /><br />
      <button onClick={() => sayWelcome("Member1")}>Say welcome</button>
      <br /><br />
      <button onClick={handleSyntheticEvent}>Click on me</button>
      <br /><br />
      {/* Currency Converter */}
      <CurrencyConvertor />
    </div>
  );
}

export default App;
