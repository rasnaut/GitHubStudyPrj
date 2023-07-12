const toByeArbyz = (personKg, timeInterval, temperature) => {
    const mustHaveArbyzikPerDay = 3;
    const personKgValue = 70;
    const minPersonKgValue = 40;
    const maxTemperatyre = 27;
  
    const onDay =
      personKg > minPersonKgValue
        ? (personKg / personKgValue) *  mustHaveArbyzikPerDay
        : mustHaveArbyzikPerDay;
    const onDayWithTemp = temperature > maxTemperatyre ? (onDay / 100) * 130 : onDay;
    const arbyzikOnDay = onDayWithTemp / timeInterval;
    const needArbyzikOnDay =
      arbyzikOnDay < mustHaveArbyzikPerDay
        ?  onDayWithTemp 
        : arbyzikOnDay;
    const needArbyzikAtAll = needArbyzikOnDay  * timeInterval;
    console.log(needArbyzikAtAll.toFixed(1) + ' kg');
  };
  toByeArbyz(200, 5, 30);