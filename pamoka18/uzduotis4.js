window.onload = function() {

    const masyvas = [15, 20, 17, 30, 25, 18, 9, 8];
    console.log(kasAntrasSkaicius(masyvas));
}

function kasAntrasSkaicius(masyvas){
    const naujasMasyvas = [];
    for(let i = 0; i < masyvas.length; i += 2){
        naujasMasyvas.push(masyvas[i]);
    }
    return naujasMasyvas;
}
