// pages/home.js

import Link from 'next/link';
import "../src/app/globals.css";
import SearchBar from '@/components/searchBar';


export default function Home() {
  return (
    <div className="scrollable-container h-[800px] overflow-y-scroll relative" style={{ backgroundColor: '#6FC3D6' }}>
      <div className="absolute top-0 left-0 w-full h-14 bg-white z-10"></div>
      <div class="flex justify-between items-center mb-16 mt-4 ">
        <div class="ml-6 space-x-12 z-20">
          <Link href="/why-choose-etf" className="text-[#186779] hover:text-gray-400">Why choose ETF</Link>
          <Link href="/popular-etfs" className="text-[#186779] hover:text-gray-400">Popular ETFs</Link>
        </div>
        <div class=" mr-6 space-x-12 z-20">
          <Link href="/login" className="text-[#186779] hover:text-gray-400">Login</Link>
          <Link href="/signup" className="text-[#186779] hover:text-gray-400">Signup</Link>
        </div>
        
      </div>

      <h1 className="mt-32 mb-6 flex justify-center text-3xl font-bold text-white">ETF Guardian</h1>
      <div className= "flex justify-center">
        <SearchBar/>
      </div>
      
    </div>
  );
}
