import { render, screen } from '@testing-library/react';
import App from './App';
import React from 'react';

// test('renders learn react link', () => {
//   render(<App />);
//   const linkElement = screen.getByText(/learn react/i);
//   expect(linkElement).toBeInTheDocument();
// });


// // check if the document contains the text "Hello Everyone"

test('renders hello everyone', () => {
  render(<App />);
  const linkElement = screen.getByText(/Hello Everyone/i);
  expect(linkElement).toBeInTheDocument();
});
