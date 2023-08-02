import React from 'react'
import ShowPerson from './ShowPerson';

const ListRendering = () => {
    const names = ['John', 'Peter', 'Mark', 'James', 'Mary'];
    const persons = [{
        id: 1,
        name: 'John',
        age: 30,
        skill: 'React'
    },
    {
        id: 2,
        name: 'Peter',
        age: 25,
        skill: 'Angular'
    },
    {
        id: 3,
        name: 'Mark',
        age: 35,
        skill: 'Vue'
    },
{
        id: 4,
        name: 'James',
        age: 40,
        skill: 'Spring Boot'
},
{
        id: 5,
        name: 'Mary',
        age: 45,
        skill: 'Django'
    }]

    return (
        <div>
            {/* <h2>List of names</h2>
            <ol>
                {names.map((uname, index) => <li key={index}>{uname}</li>)}
            </ol> */}

            <h2>List of Persons</h2>
            <div className='container'>
            <div className='row'>
            
                {persons.map(person=><ShowPerson key={person.id} person={person}/>)}
            </div>
        </div>
        </div>
    )
}

export default ListRendering
