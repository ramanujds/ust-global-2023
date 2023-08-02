import React from 'react'
import './Rendering.css'

const ShowPerson = ({person}) => {
  return (
    <div className='col-4 card-style'>
        <div className='card'>
            <div className='card-header'>
                <h3>Person Details</h3>
                <p>ID : {person.id}</p>
                <p>Name : {person.name}</p>
                <p>Age : {person.age}</p>
                <p>Skill : {person.skill}</p>
            </div>
            </div>
            </div>
        
  )
}

export default ShowPerson
