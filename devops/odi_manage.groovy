import java.util.logging.Logger
import javax.swing.tree.DefaultMutableTreeNode
import java.util.logging.Level
import oracle.odi.core.OdiInstance;
import oracle.odi.core.config.MasterRepositoryDbInfo
import oracle.odi.core.config.OdiInstanceConfig
import oracle.odi.core.config.PoolingAttributes
import oracle.odi.core.config.WorkRepositoryDbInfo
import oracle.odi.core.persistence.transaction.ITransactionStatus
import oracle.odi.core.persistence.transaction.support.DefaultTransactionDefinition
import oracle.odi.core.security.Authentication
import oracle.odi.domain.runtime.loadplan.OdiLoadPlan
import oracle.odi.domain.runtime.scenario.OdiScenario
import oracle.odi.domain.runtime.scenario.OdiScenarioFolder
import oracle.odi.domain.runtime.scenario.finder.IOdiScenarioFinder
import oracle.odi.domain.runtime.scenario.finder.IOdiScenarioFolderFinder
import oracle.odi.impexp.EncodingOptions
import oracle.odi.impexp.support.ExportServiceImpl
import oracle.odi.impexp.support.ImportServiceImpl

logger = Logger.getLogger("oracle.jdbc")
logger.setLevel(Level.SEVERE)

logger = Logger.getLogger("oracle.odi")
logger.setLevel(Level.SEVERE)

logger = Logger.getLogger("org.eclipse")
logger.setLevel(Level.SEVERE)

def listObjects (odiInstance,odiClass,listOfObjects) {
	odiObjects = odiInstance.getTransactionalEntityManager().getFinder(odiClass).findAll().sort{it.name}
	for (Object odiSingleObject: odiObjects) 
		listOfObjects.add(odiSingleObject)
}
def test1(){
    println "Hello World From Groovy Script...TEST1 "
}
def test2(){
    println "Hello World From Groovy Script...TEST2 "
}
return this
