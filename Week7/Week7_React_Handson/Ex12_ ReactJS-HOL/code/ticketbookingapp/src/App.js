import React, { useState } from "react";

// Guest page showing just flight details (no booking option)
function GuestPage({ onLogin }) {
  return (
    <div style={{ textAlign: 'center' }}>
      <h2>Flight Details</h2>
      {/* Example flights */}
     
      <p><b>Login to book tickets!</b></p>
      <button onClick={onLogin}>Login</button>
    </div>
  );
}

// User page showing booking option
function UserPage({ onLogout }) {
  return (
    <div style={{ textAlign: 'center' }}>
      <h2>Book Your Flight</h2>
      
      <button onClick={onLogout}>Logout</button>
    </div>
  );
}
function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  let pageElement;

  if (isLoggedIn) {
    pageElement = <UserPage onLogout={() => setIsLoggedIn(false)} />;
  } else {
    pageElement = <GuestPage onLogin={() => setIsLoggedIn(true)} />;
  }

  return (
    <div style={{ marginTop: 40 }}>
      <h1 style={{ textAlign: 'center', color: 'green' }}>Ticket Booking App</h1>
      {/* Conditional content: */}
      {pageElement}
    </div>
  );
}

export default App;
