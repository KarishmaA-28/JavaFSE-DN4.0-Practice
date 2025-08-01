import React, { useState } from 'react';
import { books, blogs, courses } from './data'; 
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  

  const [view, setView] = useState('all');  
  let content;
  if (view === 'books') {
    content = <BookDetails books={books} />;
  } else if (view === 'blogs') {
    content = <BlogDetails blogs={blogs} />;
  } else if (view === 'courses') {
    content = <CourseDetails courses={courses} />;
  } else {
    content = (
      <>
        <BookDetails books={books} />
        <BlogDetails blogs={blogs} />
        <CourseDetails courses={courses} />
      </>
    );
  }

  return (
    <div style={{ padding: 40 }}>
      <h1>Blogger App (Conditional Rendering Lab)</h1>
      <button onClick={() => setView('all')}>Show All</button>
      <button onClick={() => setView('books')}>Book Details</button>
      <button onClick={() => setView('blogs')}>Blog Details</button>
      <button onClick={() => setView('courses')}>Course Details</button>
      <hr />
      {content}
    </div>
  );
}


export default App;
