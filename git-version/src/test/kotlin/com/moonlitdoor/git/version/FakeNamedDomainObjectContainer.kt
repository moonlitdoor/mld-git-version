package com.moonlitdoor.git.version

import com.moonlitdoor.git.version.extensions.BranchOffsetNestedExtension
import groovy.lang.Closure
import org.gradle.api.*
import org.gradle.api.provider.Provider
import org.gradle.api.specs.Spec
import java.util.*

class FakeNamedDomainObjectContainer<T> : NamedDomainObjectContainer<T> {


    private val container = mutableMapOf<String, T>()

    override fun iterator(): MutableIterator<T> = container.values.iterator()

    override fun add(element: T): Boolean = if (element is BranchOffsetNestedExtension) {
        container[element.name] = element
        true
    } else {
        false
    }


    override fun contains(element: T): Boolean {
        TODO("not implemented1") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addAll(elements: Collection<T>): Boolean {
        TODO("not implemented2") //To change body of created functions use File | Settings | File Templates.
    }

    override fun matching(spec: Spec<in T>): NamedDomainObjectSet<T> {
        TODO("not implemented3") //To change body of created functions use File | Settings | File Templates.
    }

    override fun matching(spec: Closure<*>): NamedDomainObjectSet<T> {
        TODO("not implemented4") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clear() {
        TODO("not implemented5") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addRule(rule: Rule): Rule {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addRule(description: String, ruleAction: Closure<*>): Rule {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addRule(description: String, ruleAction: Action<String>): Rule {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun configure(configureClosure: Closure<*>): NamedDomainObjectContainer<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addAllLater(provider: Provider<out MutableIterable<T>>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun create(name: String): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun create(name: String, configureClosure: Closure<*>): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun create(name: String, configureAction: Action<in T>): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeAll(elements: Collection<T>): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun all(action: Action<in T>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun all(action: Closure<*>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun register(name: String, configurationAction: Action<in T>): NamedDomainObjectProvider<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun register(name: String): NamedDomainObjectProvider<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun named(name: String): NamedDomainObjectProvider<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun named(name: String, configurationAction: Action<in T>): NamedDomainObjectProvider<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <S : T> named(name: String, type: Class<S>): NamedDomainObjectProvider<S> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <S : T> named(name: String, type: Class<S>, configurationAction: Action<in S>): NamedDomainObjectProvider<S> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getNamer(): Namer<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRules(): MutableList<Rule> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCollectionSchema(): NamedDomainObjectCollectionSchema {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun whenObjectRemoved(action: Action<in T>): Action<in T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun whenObjectRemoved(action: Closure<*>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findAll(spec: Closure<*>): MutableSet<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addLater(provider: Provider<out T>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isEmpty(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getByName(name: String): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getByName(name: String, configureClosure: Closure<*>): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getByName(name: String, configureAction: Action<in T>): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun configureEach(action: Action<in T>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun maybeCreate(name: String): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <S : T> withType(type: Class<S>): NamedDomainObjectSet<S> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <S : T> withType(type: Class<S>, configureAction: Action<in S>): DomainObjectCollection<S> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <S : T> withType(type: Class<S>, configureClosure: Closure<*>): DomainObjectCollection<S> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findByName(name: String): T? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun whenObjectAdded(action: Action<in T>): Action<in T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun whenObjectAdded(action: Closure<*>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun retainAll(elements: Collection<T>): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getNames(): SortedSet<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAsMap(): SortedMap<String, T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAt(name: String): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override val size: Int
        get() = 10//TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun remove(element: T): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}