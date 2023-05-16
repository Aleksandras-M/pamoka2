window.onload = function() {

    let x = +prompt(`Įveskite skaičių kuri norite patikrinti`);
    arPirminis(x);
}

function arPirminis(x){
    for(let i = 0; i < x; i++)
    if ((x % i != 1)  && (x / x == 1)){
        console.log(`skaičius ${x} yra pirminis`)
    } else {
        console.log(`skaičius ${x} nėra pirminis`)
    }
}