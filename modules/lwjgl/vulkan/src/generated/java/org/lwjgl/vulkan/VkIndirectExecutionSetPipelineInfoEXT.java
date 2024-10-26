/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Struct specifying parameters of a newly created indirect execution set containing only pipelines.
 * 
 * <h5>Description</h5>
 * 
 * <p>The characteristics of {@code initialPipeline} will be used to validate all pipelines added to the set even if they are removed from the set or destroyed.</p>
 * 
 * <p>When an Indirect Execution Set created with pipelines is used, {@code initialPipeline} constitutes the initial shader state.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-supportedIndirectCommandsShaderStagesPipelineBinding">{@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT}{@code ::supportedIndirectCommandsShaderStagesPipelineBinding}</a> does not contain {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT}, the {@code VkPipelineBindPoint} of {@code initialPipeline} <b>must</b> not be {@link VK10#VK_PIPELINE_BIND_POINT_COMPUTE PIPELINE_BIND_POINT_COMPUTE}</li>
 * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-supportedIndirectCommandsShaderStagesPipelineBinding">{@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT}{@code ::supportedIndirectCommandsShaderStagesPipelineBinding}</a> does not contain {@link VK10#VK_SHADER_STAGE_FRAGMENT_BIT SHADER_STAGE_FRAGMENT_BIT}, the {@code VkPipelineBindPoint} of {@code initialPipeline} <b>must</b> not be {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
 * <li>If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-supportedIndirectCommandsShaderStagesPipelineBinding">{@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT}{@code ::supportedIndirectCommandsShaderStagesPipelineBinding}</a> does not contain ray tracing stages, the {@code VkPipelineBindPoint} of {@code initialPipeline} <b>must</b> not be {@link KHRRayTracingPipeline#VK_PIPELINE_BIND_POINT_RAY_TRACING_KHR PIPELINE_BIND_POINT_RAY_TRACING_KHR}</li>
 * <li>{@code maxPipelineCount} <b>must</b> be between 1 and {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT}{@code ::maxIndirectPipelineCount}</li>
 * <li>{@code initialPipeline} <b>must</b> not use descriptors of type {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}</li>
 * <li>{@code initialPipeline} <b>must</b> have been created with {@link EXTDeviceGeneratedCommands#VK_PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_EXT PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_EXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT}</li>
 * <li>{@code initialPipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkIndirectExecutionSetInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkIndirectExecutionSetPipelineInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipeline {@link #initialPipeline};
 *     uint32_t {@link #maxPipelineCount};
 * }</code></pre>
 */
public class VkIndirectExecutionSetPipelineInfoEXT extends Struct<VkIndirectExecutionSetPipelineInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        INITIALPIPELINE,
        MAXPIPELINECOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INITIALPIPELINE = layout.offsetof(2);
        MAXPIPELINECOUNT = layout.offsetof(3);
    }

    protected VkIndirectExecutionSetPipelineInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkIndirectExecutionSetPipelineInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkIndirectExecutionSetPipelineInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkIndirectExecutionSetPipelineInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectExecutionSetPipelineInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the initial pipeline for the set. This pipeline will be automatically added to the set at index 0. */
    @NativeType("VkPipeline")
    public long initialPipeline() { return ninitialPipeline(address()); }
    /** the maximum number of pipelines stored in the set. */
    @NativeType("uint32_t")
    public int maxPipelineCount() { return nmaxPipelineCount(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkIndirectExecutionSetPipelineInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT} value to the {@link #sType} field. */
    public VkIndirectExecutionSetPipelineInfoEXT sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkIndirectExecutionSetPipelineInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #initialPipeline} field. */
    public VkIndirectExecutionSetPipelineInfoEXT initialPipeline(@NativeType("VkPipeline") long value) { ninitialPipeline(address(), value); return this; }
    /** Sets the specified value to the {@link #maxPipelineCount} field. */
    public VkIndirectExecutionSetPipelineInfoEXT maxPipelineCount(@NativeType("uint32_t") int value) { nmaxPipelineCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkIndirectExecutionSetPipelineInfoEXT set(
        int sType,
        long pNext,
        long initialPipeline,
        int maxPipelineCount
    ) {
        sType(sType);
        pNext(pNext);
        initialPipeline(initialPipeline);
        maxPipelineCount(maxPipelineCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectExecutionSetPipelineInfoEXT set(VkIndirectExecutionSetPipelineInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectExecutionSetPipelineInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectExecutionSetPipelineInfoEXT malloc() {
        return new VkIndirectExecutionSetPipelineInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectExecutionSetPipelineInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectExecutionSetPipelineInfoEXT calloc() {
        return new VkIndirectExecutionSetPipelineInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectExecutionSetPipelineInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkIndirectExecutionSetPipelineInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectExecutionSetPipelineInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectExecutionSetPipelineInfoEXT} instance for the specified memory address. */
    public static VkIndirectExecutionSetPipelineInfoEXT create(long address) {
        return new VkIndirectExecutionSetPipelineInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkIndirectExecutionSetPipelineInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkIndirectExecutionSetPipelineInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetPipelineInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetPipelineInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetPipelineInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetPipelineInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetPipelineInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetPipelineInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkIndirectExecutionSetPipelineInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetPipelineInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkIndirectExecutionSetPipelineInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkIndirectExecutionSetPipelineInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectExecutionSetPipelineInfoEXT malloc(MemoryStack stack) {
        return new VkIndirectExecutionSetPipelineInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkIndirectExecutionSetPipelineInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectExecutionSetPipelineInfoEXT calloc(MemoryStack stack) {
        return new VkIndirectExecutionSetPipelineInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetPipelineInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetPipelineInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetPipelineInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetPipelineInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkIndirectExecutionSetPipelineInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkIndirectExecutionSetPipelineInfoEXT.PNEXT); }
    /** Unsafe version of {@link #initialPipeline}. */
    public static long ninitialPipeline(long struct) { return UNSAFE.getLong(null, struct + VkIndirectExecutionSetPipelineInfoEXT.INITIALPIPELINE); }
    /** Unsafe version of {@link #maxPipelineCount}. */
    public static int nmaxPipelineCount(long struct) { return UNSAFE.getInt(null, struct + VkIndirectExecutionSetPipelineInfoEXT.MAXPIPELINECOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectExecutionSetPipelineInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkIndirectExecutionSetPipelineInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #initialPipeline(long) initialPipeline}. */
    public static void ninitialPipeline(long struct, long value) { UNSAFE.putLong(null, struct + VkIndirectExecutionSetPipelineInfoEXT.INITIALPIPELINE, value); }
    /** Unsafe version of {@link #maxPipelineCount(int) maxPipelineCount}. */
    public static void nmaxPipelineCount(long struct, int value) { UNSAFE.putInt(null, struct + VkIndirectExecutionSetPipelineInfoEXT.MAXPIPELINECOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkIndirectExecutionSetPipelineInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkIndirectExecutionSetPipelineInfoEXT, Buffer> implements NativeResource {

        private static final VkIndirectExecutionSetPipelineInfoEXT ELEMENT_FACTORY = VkIndirectExecutionSetPipelineInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkIndirectExecutionSetPipelineInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectExecutionSetPipelineInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkIndirectExecutionSetPipelineInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkIndirectExecutionSetPipelineInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkIndirectExecutionSetPipelineInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkIndirectExecutionSetPipelineInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkIndirectExecutionSetPipelineInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkIndirectExecutionSetPipelineInfoEXT#initialPipeline} field. */
        @NativeType("VkPipeline")
        public long initialPipeline() { return VkIndirectExecutionSetPipelineInfoEXT.ninitialPipeline(address()); }
        /** @return the value of the {@link VkIndirectExecutionSetPipelineInfoEXT#maxPipelineCount} field. */
        @NativeType("uint32_t")
        public int maxPipelineCount() { return VkIndirectExecutionSetPipelineInfoEXT.nmaxPipelineCount(address()); }

        /** Sets the specified value to the {@link VkIndirectExecutionSetPipelineInfoEXT#sType} field. */
        public VkIndirectExecutionSetPipelineInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkIndirectExecutionSetPipelineInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT} value to the {@link VkIndirectExecutionSetPipelineInfoEXT#sType} field. */
        public VkIndirectExecutionSetPipelineInfoEXT.Buffer sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT); }
        /** Sets the specified value to the {@link VkIndirectExecutionSetPipelineInfoEXT#pNext} field. */
        public VkIndirectExecutionSetPipelineInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkIndirectExecutionSetPipelineInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkIndirectExecutionSetPipelineInfoEXT#initialPipeline} field. */
        public VkIndirectExecutionSetPipelineInfoEXT.Buffer initialPipeline(@NativeType("VkPipeline") long value) { VkIndirectExecutionSetPipelineInfoEXT.ninitialPipeline(address(), value); return this; }
        /** Sets the specified value to the {@link VkIndirectExecutionSetPipelineInfoEXT#maxPipelineCount} field. */
        public VkIndirectExecutionSetPipelineInfoEXT.Buffer maxPipelineCount(@NativeType("uint32_t") int value) { VkIndirectExecutionSetPipelineInfoEXT.nmaxPipelineCount(address(), value); return this; }

    }

}