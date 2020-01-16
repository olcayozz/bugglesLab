import java.util.logging.*
import javax.swing.tree.*
import oracle.odi.core.*;
import oracle.odi.core.config.*
import oracle.odi.core.persistence.transaction.*
import oracle.odi.core.persistence.transaction.support.*
import oracle.odi.core.security.*
import oracle.odi.domain.runtime.loadplan.*
import oracle.odi.domain.runtime.scenario.*
import oracle.odi.domain.runtime.scenario.finder.*
import oracle.odi.impexp.*
import oracle.odi.impexp.support.*


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
