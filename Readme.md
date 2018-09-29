
Java command-line parsing libraries
===================================

Link to raw JSON file
---------------------

The raw .json file is available from this link: <https://raw.githubusercontent.com/timtiemens/javacommandlineparser/master/java-parsers.json>


Top Ranking Java command-line parsing libraries
-----------------------------------------------
1. [JCommander](http://jcommander.org/)
2. [picocli](http://picocli.info)
3. [args4j](http://args4j.kohsuke.org/)
4. [JewelCLI](http://jewelcli.lexicalscope.com/)



Alphabetical list of Java command-line parsing libraries
--------------------------------------------------------
Below is a table showing Java command-line parsing libraries, sorted by name.  "Rank" is my rank for the library (1 to 4, or blank).  "Annotation" indicates the library uses Java annotations for argument metadata (i.e. "good").  "KeyValue" indicates that the library uses Java map structures to store and access the arguments (i.e. "bad").

|Name | Rank | Lang | Annotation | KeyValue | Notes|
|---|---|---|---|---|---|
|[Airline](https://github.com/airlift/airline)||java|X||
|[argot](http://software.clapper.org/argot/)||scala|||abandoned - see scopt
|[argparse4j](https://github.com/tatsuhiro-t/argparse4j)||java|||
|[argparser](http://www.cs.ubc.ca/spider/lloyd/java/argparser.html)||java||X|create individual options, where options are "holders", parse() into the holders
|[args4j](http://args4j.kohsuke.org/)|3|java|X||field-based, unclear if "--long-Name" is supported
|[clajr](http://clajr.sourceforge.net/)||java|||
|[cli-parser](http://code.google.com/p/cli-parser/)||java|||
|[CmdLn](http://ostermiller.org/utils/CmdLn.html)||java||X|
|[Commandline](https://github.com/jankroken/commandline)||java|X||
|[DocOpt.java](https://github.com/docopt/docopt.java)||java||X|weird String-based approach to defining argument names and help at the same time.  port of docopt.
|[dolphin getopt](http://dolphin.sourceforge.net/getopt/)||java|||
|[DPML CLI](http://www.dpml.net/util/cli/index.html)||java|||Jakarta Commons CLI2 fork
|[Dr. Matthias Laux](http://www.javaworld.com/javaworld/jw-08-2004/jw-0816-command.html)||java|||
|[Jakarta Commons CLI](http://jakarta.apache.org/commons/cli/)||java||X|like JArgs, except key is "String", not an Option object
|[jargo](https://github.com/Softhouse/jargo)||java||X|
|[jargp](http://jargp.sourceforge.net/)||java|||
|[JArgs](http://jargs.sourceforge.net/)||java||X|single "parse" call with array of options, key is an Option object
|[java-getopt](http://www.urbanophile.com/arenn/hacking/download.html)||java|||
|[jbock](https://github.com/h908714124/jbock)||java|X||
|[JCLAP](http://www.snaq.net/java/JCLAP/)||java|||
|[jcmdline](http://jcmdline.sourceforge.net/)||java|||
|[JCommander](http://jcommander.org/)|1|java|X||good documentation, custom parser, validation
|[JCommando](http://jcommando.sourceforge.net/)||java|||generates .java, but still requires an additional .jar
|[JewelCLI](http://jewelcli.lexicalscope.com/)|4|java|X||interface-based but can be instance-based with setters
|[JOpt simple](http://jopt-simple.sourceforge.net)||java||X|
|[JSAP](http://www.martiansoftware.com/jsap/)||java||X|old (2008) not well documented
|[naturalcli](http://naturalcli.sourceforge.net/)||java|||
|[Object Mentor CLI article](http://www.objectmentor.com/resources/articles/Clean_Code_Args.pdf) dead link||java|||
|[optional](https://github.com/alexy/optional)||scala|||multiple github forks
|[parse-cmd](http://code.google.com/p/parse-cmd/)||java|||
|[picocli](http://picocli.info)|2|java|X||good documentation - documentation looks suspiciously like it is patterned after JCommander
|[ritopt](http://ritopt.sourceforge.net/)||java|||
|[Rop](http://ryenus.github.io/rop/)||java|||
|[scopt](https://github.com/jstrachan/scopt)||scala|||
|[TE-Code Command](http://te-code.sourceforge.net/)||java|||



Important Features in Command-Line Parsing Library
--------------------------------------------------
* API uses annotations, not key-value
* Generates help
* Short (-v) and Long (--verbose) parsing to same field
* Sub-commands (git add ...), can have their own options
* License (i.e. not GPL)
* Does not depend on other libraries
* Java version


References
----------
* Java Command-Line Interfaces (Part N of 30)
   number 1 covers Commons-CLI, number 2 covers args4j,
   number 7 covers JCommander, number 21 covers Airline,
   number 28 covers getopt4j, and
     number 30 is a summation and "5 most likely to succeed" (commons-CLI, args4j, JCommander, JewelCLI, picocli) section.
  <http://marxsoftware.blogspot.com/> - See 2017 June to November
* Maven Repository Command Line Parsers category
  2018 September sorted by popularity: commons-CLI, JCommander, args4j, jopt-simple, scopt, argparse4j, Airline, JSAP.
  <https://mvnrepository.com/open-source/command-line-parsers>
* stackoverflow 2008 December
     <https://stackoverflow.com/questions/367706/how-do-i-parse-command-line-arguments-in-java>
* stackoverflow 2009 October (marked duplicate)
    <https://stackoverflow.com/questions/1524661/the-best-cli-parser-for-java>
* stackoverflow 2011 September
    <https://stackoverflow.com/questions/7341683/parsing-arguments-to-a-java-command-line-program/7341992>
* JewelCli alternatives list
    <http://jewelcli.lexicalscope.com/related.html>
* Compare JCommander and picoli
   <https://java.libhunt.com/compare-picocli-vs-jcommander?rel=cmp-lib>
* Picoli alternatives list and feature charts
   <https://github.com/remkop/picocli/wiki/CLI-Comparison>
