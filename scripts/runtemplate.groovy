#!/usr/bin/env groovy

File jsonFile = new File("java-parsers.json")
def jsonText = jsonFile.getText()
def slurper = new groovy.json.JsonSlurper()
def json = slurper.parseText(jsonText)

File templateFile = new File("templates/htmllist.mte")
templateText = templateFile.getText()

def engine
def templateFileAsString = templateFile.toString()
if (templateFileAsString.endsWith(".ste")) {
  engine = new groovy.text.SimpleTemplateEngine()
} else if (templateFileAsString.endsWith(".mte")) {
  def config = new groovy.text.markup.TemplateConfiguration()
  config.setAutoIndent(true)
  config.setAutoEscape(true)
  engine = new groovy.text.markup.MarkupTemplateEngine(config)
} else {
  print("ERROR")
  System.exit(1)
}

def template = engine.createTemplate(templateText)
def output = template.make(json)

if (false) {
   print("JSON\n")
   def prettyOut = json.toString()
   def prettyIn = groovy.json.JsonOutput.toJson(json)
   print("IN is " + prettyIn + "\n+++++\n")
   prettyOut =  groovy.json.JsonOutput.prettyPrint(prettyIn)
   print(prettyOut)
   print("------\n")   
}


print(output)
print("\n")
