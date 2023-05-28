window.onload = function() {

    let pradzia = +prompt(`įveskite intervalo pradžią`);
    let pabaiga = +prompt(`įveskite intervalo pabaigą`);
    lyginiaiSkaiciaiIntervale(pradzia, pabaiga);

}

function arSkaiciusLyginis(x){
    return x % 2 == 0;
}

function lyginiaiSkaiciaiIntervale(pradzia, pabaiga) {
    for(let i = pradzia; i <= pabaiga; i++){
        if(arSkaiciusLyginis(i) == true){
            console.log(i);
        };
    }
}