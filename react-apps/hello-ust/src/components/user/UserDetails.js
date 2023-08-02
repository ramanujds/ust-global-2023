import React, { Component } from 'react'

export class UserDetails extends Component {

  constructor(props) {
    super(props);
    // this.state = {
    //   username: 'Gaurav',
    //   age: 20,
    // }
  }

  render() {

    // setTimeout(() => {
    //   this.setState({ 
    //     username: 'Gaurav Singh',
    //     age: 21
    //   });
    // }, 5000);

    return (
      <div>
        <h2>User Details</h2>
        <p>Username: {this.props.username}</p>
        <p>Age: {this.props.age}</p>
      </div>
    )
  }
}

export default UserDetails
