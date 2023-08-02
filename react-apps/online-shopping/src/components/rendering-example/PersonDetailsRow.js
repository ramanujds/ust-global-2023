import React from 'react'

const PersonDetailsRow = ({person}) => {
  return (
    <tr>
        <td>{person.id}</td>
        <td>{person.name}</td>
        <td>{person.age}</td>
        <td>{person.skill}</td>
    </tr>
  )
}

export default PersonDetailsRow
