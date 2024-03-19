
'use client'
import {AiOutlineSearch} from 'react-icons/ai'
// Remember to import words or whatever you're using to store all the words the user can search for

const Searchbar = () => {
    const handleSearch = (e) => {}
    
  return (
    <form className='w-[400px] relative'>
        <div className="relative">
            <input type="search" placeholder='Search for ETFs...' className='w-full p-4 rounded-full bg-white' onChange={(e) => handleSearch(e)}/>
            <button className='absolute right-1 top-1/2 -translate-y-1/2 p-4 bg-grey rounded-full'>
                <AiOutlineSearch />
            </button>
        </div>


        
    </form>
  )
}

export default Searchbar