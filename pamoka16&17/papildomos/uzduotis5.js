window.onload = function() {

    let n = +prompt(`Įveskite sekos skaičiaus numerį`);
    console.time('fibonnaciSkaicius');
    console.log(fibonnaciSkaicius(n));
    console.timeEnd('fibonnaciSkaicius');

    const masyvas = [0, 1];
    console.time('fibonnaciMasyvas');
    console.log(fibonnaciMasyvas(masyvas, n));
    console.timeEnd('fibonnaciMasyvas');
}

function fibonnaciSkaicius(n){
    if (n === 1) {
        return 0;
      } else if (n === 2) {
        return 1;
      } else {
        let x = 0;
        let y = 1;
        let sekantisSkaicius = 0;
        for (let i = 3; i <= n; i++) {
        sekantisSkaicius = x + y;
          x = y;
          y = sekantisSkaicius;
        }
        return sekantisSkaicius;
    }

}

function fibonnaciMasyvas(masyvas, x){
  if (x === 1){
    return masyvas[0];
  }else if(x === 2){
    return masyvas[1]
  }else {
    for (let i = 2; i <= x; i++) {
      masyvas.push(masyvas[i - 1] + masyvas[i - 2]);
    }
    return masyvas[x - 1];
}
}