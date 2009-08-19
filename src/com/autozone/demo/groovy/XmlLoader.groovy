#!/usr/bin/env groovy 

CliBuilder cli = new CliBuilder(usage: 'XmlLoader -f')
cli.h(longOpt: 'help', 'usage help', args: 1)
cli.f(longOpt: 'file', 'file to import', args: 1)
OptionAccessor opt = cli.parse(args)

if(!opt.arguments) {
	cli.usage()
	return
}

if(opt.h) {
	cli.usage()
	return
}
 
if(opt.f) {
	println opt.f
}

println "Hello Groovy World"