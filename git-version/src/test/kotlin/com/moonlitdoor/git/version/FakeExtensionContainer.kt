package com.moonlitdoor.git.version

import org.gradle.api.Action
import org.gradle.api.plugins.ExtensionContainer
import org.gradle.api.plugins.ExtensionsSchema
import org.gradle.api.plugins.ExtraPropertiesExtension
import org.gradle.api.reflect.TypeOf

class FakeExtensionContainer : ExtensionContainer {

    private val container = mutableMapOf<String, Any>()

    override fun add(name: String, extension: Any) {
        container[name] = extension
    }

    override fun <T : Any?> configure(type: Class<T>, action: Action<in T>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> configure(type: TypeOf<T>, action: Action<in T>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> configure(name: String, action: Action<in T>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getExtensionsSchema(): ExtensionsSchema {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getExtraProperties(): ExtraPropertiesExtension {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> create(publicType: Class<T>, name: String, instanceType: Class<out T>, vararg constructionArguments: Any?): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> create(publicType: TypeOf<T>, name: String, instanceType: Class<out T>, vararg constructionArguments: Any?): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> create(name: String, type: Class<T>, vararg constructionArguments: Any?): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getByName(name: String): Any = container[name]!!
//    {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }

    override fun findByName(name: String): Any? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> add(publicType: Class<T>, name: String, extension: T) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> add(publicType: TypeOf<T>, name: String, extension: T) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSchema(): MutableMap<String, TypeOf<*>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> getByType(type: Class<T>): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> getByType(type: TypeOf<T>): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> findByType(type: Class<T>): T? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> findByType(type: TypeOf<T>): T? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}