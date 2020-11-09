import React, {useState, useEffect} from 'react';
import './App.css';
import cookiePicture from './images/animecookie.png';
import cookieMonster from './images/cookiemonster.jpg';

const Cookie = () => {
    const [numbers, setNumbers] = useState(0);

    useEffect (() => {
        count("count/get")
    },[]);

    const count = (path) => {
        fetch("http://localhost:8080/" + path)
            .then(res => res.json())
            .then(res => {
                setNumbers(res)
            })
            .catch(err => {
                console.error("Probably forgot to spin up backend\n"+err)
            })
    }

    return (
        <div className="App-header">
            <div onClick={() => count("count")}>
                <img className={'App-logo'} src={cookiePicture} alt={"#"}/>
            </div>
            <img
                className={'Cookiemonster'}
                src={cookieMonster}
                onClick={() => count("countLikeAMonster")}
                alt={"#"}
            />
            { numbers }
        </div>
    );
}

export default Cookie;
