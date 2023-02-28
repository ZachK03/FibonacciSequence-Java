# Fibonacci Sequence Timer
This Java app uses both recursive and iterative solutions and records the runtime of both to show the difference in performance. Using this app will result in the runtime and size of N being output in the console in .CSV format. 

## Exporting the .CSV Data
When trying to use the .CSV data you will need a text editor and a spreadsheet application. I will be using Window's Notepad and Excel. 

After running the app copy the data from the console, it should look something like this:

    NULL,5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100 
	Iterative:,2300,500,300,400,500,500,600,600,800,800,800,1000,1000,1000,1200,1200,1300,1400,1400,4700
	Recursive:,2000,1200,1500,2300,3400,3100,12100,7700,7600,16500,7700,8300,11900,9500,11200,11800,12000,12300,13600,13400

Now, open Notepad and paste the data into it. Save the file as **\<NameHere\>.csv** and ensure you are saving as "All Files (\*.\*)", NOT "Text Documents (\*.txt)".

Find the file you saved and open it with your spreadsheet application. Once the file is open you can delete the data at A1 ("NULL") and use it however you'd please. 

## Development Process
When it came to developing this app, the easiest part was creating solutions for the Fibonacci sequence methods. However, getting the data with times and the size of N to export in the correct format for .CSV files was a pain. I had to set it so that the commas only appeared in the correct spots and then new lines were made in appropriate positions. While the .CSV formatting was difficult this solution still only took me about an hour. 

## Expanding this App
If I were to continue developing this application I would definitely make it so that the data is exported as a .CSV file instead of just being dumped into the console. This would be much cleaner and simpler to use for anyone not used to computers. 

## App Output
<p align='center'>
	<img src="https://imgur.com/mmEXdCV.png"><br/>
	The output in the terminal after running the application.
	
<img src="https://imgur.com/Ryvcpq0.png"><br/>
	The data imported into a chart using Excel.
</p>
