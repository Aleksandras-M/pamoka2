window.onload = function() {

    const masyvas = [1, 2, 3];
    console.log(masyvoSuma(masyvas) / masyvas.length);

}

function masyvoSuma(masyvas){
    let suma = 0;
    for (let i = 0; i < masyvas.length; i++) {
        suma += masyvas[i];
    }
    return suma;

}
