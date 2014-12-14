class FregePluginGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.4 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def title = "Frege Plugin" // Headline display name of the plugin
    def author = "Dierk Koenig"
    def authorEmail = "dierk.koenig@canoo.com"
    def description = '''\
Allowing to interface with code written in the Frege language
(http://www.frege-lang.org).
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/frege-plugin" // todo: update below

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
//    def license = "APACHE"

    // Details of company behind the plugin (if there is one)
//    def organization = [ name: "My Company", url: "http://www.my-company.com/" ]

    // Any additional developers beyond the author specified above.
//    def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

    // Location of the plugin's issue tracker.
//    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]

    // Online location of the plugin's browseable source code.
//    def scm = [ url: "http://svn.codehaus.org/grails-plugins/" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
		// println "in doWithWebDescriptor xml:$xml"
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
		// println "in doWithSpring it:$it"
		
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
		// println "in doWithDynamicMethods ctx:$ctx"
		
    }

    def doWithApplicationContext = { ctx ->
        // TODO Implement post initialization spring config (optional)
		// println "in doWithApplicationContext ctx:$ctx"
		
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
		println "*** in onChange event:$event"
		
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
		println "*** in onConfigChange event:$event"
		
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
		// println "in onShutdown event:$event"
		
    }
}
