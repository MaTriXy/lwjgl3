/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkDisplayModeCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDisplayModeCreateFlagsKHR flags;
 *     {@link VkDisplayModeParametersKHR VkDisplayModeParametersKHR} parameters;
 * }}</pre>
 */
public class VkDisplayModeCreateInfoKHR extends Struct<VkDisplayModeCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PARAMETERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkDisplayModeParametersKHR.SIZEOF, VkDisplayModeParametersKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PARAMETERS = layout.offsetof(3);
    }

    protected VkDisplayModeCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDisplayModeCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDisplayModeCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkDisplayModeCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplayModeCreateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkDisplayModeCreateFlagsKHR")
    public int flags() { return nflags(address()); }
    /** @return a {@link VkDisplayModeParametersKHR} view of the {@code parameters} field. */
    public VkDisplayModeParametersKHR parameters() { return nparameters(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDisplayModeCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDisplay#VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR} value to the {@code sType} field. */
    public VkDisplayModeCreateInfoKHR sType$Default() { return sType(KHRDisplay.VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDisplayModeCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkDisplayModeCreateInfoKHR flags(@NativeType("VkDisplayModeCreateFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Copies the specified {@link VkDisplayModeParametersKHR} to the {@code parameters} field. */
    public VkDisplayModeCreateInfoKHR parameters(VkDisplayModeParametersKHR value) { nparameters(address(), value); return this; }
    /** Passes the {@code parameters} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDisplayModeCreateInfoKHR parameters(java.util.function.Consumer<VkDisplayModeParametersKHR> consumer) { consumer.accept(parameters()); return this; }

    /** Initializes this struct with the specified values. */
    public VkDisplayModeCreateInfoKHR set(
        int sType,
        long pNext,
        int flags,
        VkDisplayModeParametersKHR parameters
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        parameters(parameters);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDisplayModeCreateInfoKHR set(VkDisplayModeCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplayModeCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplayModeCreateInfoKHR malloc() {
        return new VkDisplayModeCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDisplayModeCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplayModeCreateInfoKHR calloc() {
        return new VkDisplayModeCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDisplayModeCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDisplayModeCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplayModeCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDisplayModeCreateInfoKHR} instance for the specified memory address. */
    public static VkDisplayModeCreateInfoKHR create(long address) {
        return new VkDisplayModeCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDisplayModeCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkDisplayModeCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDisplayModeCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDisplayModeCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayModeCreateInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayModeCreateInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayModeCreateInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayModeCreateInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayModeCreateInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayModeCreateInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayModeCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayModeCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDisplayModeCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayModeCreateInfoKHR malloc(MemoryStack stack) {
        return new VkDisplayModeCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDisplayModeCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayModeCreateInfoKHR calloc(MemoryStack stack) {
        return new VkDisplayModeCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayModeCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDisplayModeCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDisplayModeCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkDisplayModeCreateInfoKHR.FLAGS); }
    /** Unsafe version of {@link #parameters}. */
    public static VkDisplayModeParametersKHR nparameters(long struct) { return VkDisplayModeParametersKHR.create(struct + VkDisplayModeCreateInfoKHR.PARAMETERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDisplayModeCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDisplayModeCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkDisplayModeCreateInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #parameters(VkDisplayModeParametersKHR) parameters}. */
    public static void nparameters(long struct, VkDisplayModeParametersKHR value) { memCopy(value.address(), struct + VkDisplayModeCreateInfoKHR.PARAMETERS, VkDisplayModeParametersKHR.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkDisplayModeCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkDisplayModeCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkDisplayModeCreateInfoKHR ELEMENT_FACTORY = VkDisplayModeCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDisplayModeCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplayModeCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkDisplayModeCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDisplayModeCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDisplayModeCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkDisplayModeCreateFlagsKHR")
        public int flags() { return VkDisplayModeCreateInfoKHR.nflags(address()); }
        /** @return a {@link VkDisplayModeParametersKHR} view of the {@code parameters} field. */
        public VkDisplayModeParametersKHR parameters() { return VkDisplayModeCreateInfoKHR.nparameters(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDisplayModeCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDisplayModeCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRDisplay#VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR} value to the {@code sType} field. */
        public VkDisplayModeCreateInfoKHR.Buffer sType$Default() { return sType(KHRDisplay.VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDisplayModeCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkDisplayModeCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkDisplayModeCreateInfoKHR.Buffer flags(@NativeType("VkDisplayModeCreateFlagsKHR") int value) { VkDisplayModeCreateInfoKHR.nflags(address(), value); return this; }
        /** Copies the specified {@link VkDisplayModeParametersKHR} to the {@code parameters} field. */
        public VkDisplayModeCreateInfoKHR.Buffer parameters(VkDisplayModeParametersKHR value) { VkDisplayModeCreateInfoKHR.nparameters(address(), value); return this; }
        /** Passes the {@code parameters} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDisplayModeCreateInfoKHR.Buffer parameters(java.util.function.Consumer<VkDisplayModeParametersKHR> consumer) { consumer.accept(parameters()); return this; }

    }

}