// pages/home.js

import Link from 'next/link';
import "../src/app/globals.css";


export default function Home() {
  return (
    <div className="scrollable-container h-[1600px] overflow-y-scroll relative" style={{ backgroundColor: '#A2E4F3' }}>
      <div className="flex justify-between items-center mb-16 space-x-10">
        <Link href="/why-choose-etf" className="text-black hover:text-gray-400">Why choose ETF</Link>
        <Link href="/popular-etfs" className="text-black hover:text-gray-400">Popular ETFs</Link>
        <Link href="/login" className="text-black hover:text-gray-400">Login</Link>
        <Link href="/signup" className="text-black hover:text-gray-400">Signup</Link>
      </div>

      <h1 className="text-2xl font-bold">ETF Guardian</h1>

    </div>
  );
}
