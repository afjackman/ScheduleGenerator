Usage Instructions:

- Algorithm uses the input.txt file for movie times, and the name of the file is NOT an argument as requested by the assignment

Design Notes:

- I did a variety of refactoring, so the objects have changed in name a bit and the code structure has changed a bit - for clarity!
- The overarching function can be found in Main, as expected.
- The movie timing algorithm can be found in the constructor for MovieSchedule and is explained in the comments there. It consists of two loops, the first of which places the movies in order one after the other as early as possible, the second of which loops through the movies and pulls them ultimately to be as late as possible, with a preference for times which are divisible by 5.
- The object models are as follows:
1. The BusinessHours object contains a week worth of SingleDayBusinessHours.
2. The TheaterSchedule object contains the set of MovieSchedule objects that apply to a single day.
3. A MovieSchedule object holds a Movie object and a list of Showtime objects.
- The schedule is created when passing the correct parameters into the constructor of the TheaterSchedule, which causes it to build itself.
- We then print the TheaterSchedule using .toString().

Other Notes:

- I did not get to unit testing, but I did play around with the times to find that movies of length 2:33 and 3:36 (I'd imagine there are others) can cause start times to be non-5s