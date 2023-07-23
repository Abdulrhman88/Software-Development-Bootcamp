function tossCoin() {
  return Math.random() > 0.5 ? "heads" : "tails";
}

function fiveHeads() {
  return new Promise((resolve, reject) => {
    let headsCount = 0;
    let attempts = 0;

    while (headsCount < 5 && attempts <= 100) {
      attempts++;
      console.log(attempts);
      let result = tossCoin();
      result == "heads" ? headsCount++ : (headsCount = 0);
    }

    if (headsCount == 5) {
      resolve(`It teak ${attempts} tries to flip five "heads"`);
    } else {
      reject(`It teak ${attempts} tries and does not flip five "heads"`);
    }

  });
}
fiveHeads()
  .then((res) => console.log(res))
  .catch((err) => console.log(err));
console.log("When does this run now?");