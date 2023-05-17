window.onload = function() {

    const masyvas = [1, 2, 3];
    console.log(masyvoSandauga(masyvas));

}

function masyvoSandauga(masyvas){
    let sandauga = 1;
    for (let i = 0; i < masyvas.length; i++) {
        sandauga *= masyvas[i];
    }
    return sandauga;

}