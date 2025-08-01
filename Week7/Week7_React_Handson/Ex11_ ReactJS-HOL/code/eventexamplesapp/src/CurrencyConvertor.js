import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('Euro'); // Default Euro

  // Simple conversion logic: assume 1 Euro = 80 Rupees
  const rate = 80;

  const handleSubmit = (e) => {
    e.preventDefault(); // Prevent page reload
    if (currency === 'Euro' && !isNaN(Number(amount))) {
      const converted = Number(amount) * rate;
      alert(`Converting to Euro Amount is ${converted}`);
    } else {
      alert('Please enter a number in Amount and choose Euro.');
    }
  };

  return (
    <div style={{ marginTop: 30 }}>
      <h1 style={{ color: 'green' }}>Currency Convertor!!!</h1>
      <form onSubmit={handleSubmit}>
        <label>
          Amount:
          <input
            type="number"
            value={amount}
            onChange={e => setAmount(e.target.value)}
            style={{ margin: '5px' }}
          />
        </label>
        <br />
        <label>
          Currency:
          <input
            type="text"
            value={currency}
            onChange={e => setCurrency(e.target.value)}
            style={{ margin: '5px' }}
          />
        </label>
        <br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConvertor;
