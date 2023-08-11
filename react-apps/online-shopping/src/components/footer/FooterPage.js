import React from 'react'

const FooterPage = () => {
  return (
   // display the a simple footer with copy right information and developer information in a fixed position
    <div style={{paddingTop:'2rem'}} className='row sticky-bottom'>
        <div className='col-12'>
        <footer className="bg-light text-center text-lg-start">
        <div className="text-center p-3" style={{backgroundColor: 'rgba(0, 0, 0, 0.2)'}}>
        © 2023 Smart Shopping | Developed by:
        <a className="text-dark" href="https://ust.com/">UST Global</a>
        </div>
        </footer>
        </div>
    </div>
    )
    
}

export default FooterPage
