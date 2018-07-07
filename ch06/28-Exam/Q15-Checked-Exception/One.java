// Which of the following are checked exceptions? 

class One extends RuntimeException{}
class Two extends Exception{}        // <--- Checked Exception
class Three extends Error{}
class Four extends One{}
class Five extends Two{}             // <--- Checked Exception
class Six extends Three{}