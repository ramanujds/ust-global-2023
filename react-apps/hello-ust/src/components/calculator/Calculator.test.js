import {render,screen, fireEvent} from "@testing-library/react";
import Calculator from "./Calculator";
import React from "react";


test('should check the initial value is zero', () => {
  render(<Calculator/>)
  const currentValue = Number(screen.getByTestId('value').textContent);
  expect(currentValue).toEqual(0)
})


test('should check value is getting incremented by 1 on button click', () => {
  
    render(<Calculator/>)
    const currentValue = Number(screen.getByTestId('value').textContent);
    const btn = screen.getByRole("button",{name:"Increment By 1"});
    fireEvent.click(btn)
    const updatedValue = Number(screen.getByTestId('value').textContent);
    expect(updatedValue).toEqual(currentValue+1)

})

test('should check value is getting added on button click', () => {
    render(<Calculator/>)
    const x = Number(screen.getByTestId('x').textContent);
    const y = Number(screen.getByTestId('y').textContent);
    const expectedSum = x+y;
    const btn = screen.getByRole("button",{name:"Add"});
    fireEvent.click(btn);
    const sum = Number(screen.getByTestId('value').textContent);
    expect(sum).toEqual(expectedSum) 

}
    )